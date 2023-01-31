// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
package hw2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class hw_1 {
    public static void main(String[] args) {
        String fileData = readAndSplit("hw2/hw1File.txt");
        String request = createRequest(doMass(fileData));
        System.out.println(request);
    }



    public static String readAndSplit(String filename) { // читает и разделяет файл
        StringBuilder resultLine = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                resultLine.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultLine.toString();


    }

    public static String[][]doMass(String data){
        String formatData = data.replace("{", "");
        formatData = formatData.replace("}", "");
        formatData = formatData.replace("\"", "");

        String[] arrData = formatData.split(",");
        String[][] resultArr = new String[arrData.length][2];
        String[] parts;
        int i = 0;
        for (int j = 0; j < resultArr.length; j++) {
            parts = arrData[i].split(":");
            i++;
            for (int k = 0; k < resultArr[1].length; k++) {
                resultArr[j][k] = parts[k];
            }
        }
        return resultArr;
    }
    public static String createRequest(String[][] doubleArr){
        StringBuilder request = new StringBuilder();
        request.append("SELECT * FROM students WHERE name");
        List<String> resultLine = new ArrayList<>();
        for (int i = 0; i < doubleArr.length; i++) {
            if (!doubleArr[i][1].equals("null")) {
                String piece = String.format("%s=\"%s\"", doubleArr[i][0], doubleArr[i][1]);
                resultLine.add(piece);
            }
        }
        request.append(String.join(" AND ", resultLine));
        return request.toString();
    }
}

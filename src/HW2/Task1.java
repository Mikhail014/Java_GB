package HW2;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sql = new StringBuilder("select * from students where ");
        String data = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        String newData = data.replace(":", "=")
                .substring(1)
                .replaceAll("}", "");

        String[] arrData = newData.split(", ");
        int ind = 0;

        for (String str: arrData){
            if (!str.contains("null")) {
                sql.append(str);
                if (ind != arrData.length - 2){
                    sql.append(" and ");
                }
            }
            ind++;
        }

        System.out.println(sql);
    }
}

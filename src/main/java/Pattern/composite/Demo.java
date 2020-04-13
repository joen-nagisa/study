package Pattern.composite;

public class Demo {
    public static void main(String[] args) {
        Employee ceo = new Employee("徐洋","董事会",30000);

        Employee pm = new Employee("侯家亮","项目组",20000);
        Employee hrHead = new Employee("正义","人事",15000);

        Employee java = new Employee("杨伍","项目组",10000);
        Employee python = new Employee("姬成刚","项目组",10000);

        Employee hr1 = new Employee("魔术师小姐","人事",8000);
        Employee hr2 = new Employee("休","人事",7000);

        ceo.add(pm);
        ceo.add(hrHead);

        pm.add(java);
        pm.add(python);

        hrHead.add(hr1);
        hrHead.add(hr2);

        for (Employee twoLayer:ceo.getSubordinates()){
            System.out.println(twoLayer);
            for(Employee threeLayer:twoLayer.getSubordinates()){
                System.out.println(threeLayer);
            }
        }
    }
}

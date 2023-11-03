public class Main {
    public static void main(String[] args) {
        Student student = new Student("Иванов Константин Евгеньевич", 22);
        System.out.println(student);

        Aspirant aspirant  = new Aspirant("Research", "Petrov Petr", 30);
        System.out.println(aspirant);

        Student student1 = new Student("Semenov Semen", 25);
        System.out.println(student1);

        Student  aspirant1 = new Aspirant("Research", "Stepanov Stepan", 34);

        Ball redBall = new Ball("red");
        Ball blackBall = new Ball("black");
        Ball redBall1 = new Ball("red");
        Ball blackBall1 = new Ball("black");

        System.out.println(redBall.getCountInstance());
        System.out.println(blackBall.getCountInstance());


    }
}

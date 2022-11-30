public class parkDog extends Animal implements AnimalAge{
    public static String[] breedList = {"Golden Retriever", "German Shepherd", "Border Collie", "Mutt", "Pit Bull", "Labrador"};

    public static String[] nameList = {"Geremy", "Gerald", "Geoffry", "Rover", "Ethan", "Victor", "Terrance", "Jeremy"};

    public static int multiAge = 100;


    public parkDog(int cuteness, int age, String name, String breed) {
        super(cuteness, age, name, breed);

    }
    public void calculateHumanAge() {
        System.out.println("Human Age = " + (age * 7));

    }
    public static void randomDog() {
        for (int i = 1; i <= Park.userAnswer; i++) {
            int randomName = ((int) Math.floor(Math.random() * nameList.length));
            int randomAge = ((int) Math.floor(Math.random() * 100));
            int randomBreed = ((int) Math.floor(Math.random() * breedList.length));
            int randomCuteness = ((int) Math.floor(Math.random() * 10) + 1);


            parkDog obj = new parkDog(randomCuteness, randomAge, nameList[randomName], breedList[randomBreed]);
            System.out.println("Dog #" + i + " = " + obj.name);
            System.out.println("Dog Cuteness = " + obj.cuteness);
            System.out.println("Breed = " + obj.breed);
            System.out.println("Age = " + randomAge);
            obj.calculateHumanAge();
            System.out.println(" ");

        }
    }


}
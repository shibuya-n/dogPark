public class parkAnimals extends Animal implements AnimalAge{
    public static String[] breedList = {"Pigeon", "Plane", "Superman", "Deer", "Pizza", "Peregrine Falcon", "Stork", "Seagull", "Raccoon", "Squirrel", "???"};

    public static String[] nameList = {"Geremy", "Gerald", "Geoffry", "Rover", "Ethan", "Victor", "Terrance", "Jeremy", "Justin", "Just-in", "???"};

    public static int multiAge = 100;
    
    public parkAnimals(int cuteness, int age, String name, String breed) {
        super(cuteness, age, name, breed);

    }
    public void calculateHumanAge() {
        int humanAge = age * 100;
        System.out.println("Human Age = " + (age * multiAge));
    }

        public static void randomCritters() {
            int critterNum = ((int) Math.floor(Math.random() * nameList.length) + 1);
            System.out.println("You also found other animals!!!");

            for (int i = 1; i <= critterNum; i++) {
                int randomName = ((int) Math.floor(Math.random() * nameList.length));
                int randomAge = ((int) Math.floor(Math.random() * 100));
                int randomBreed = ((int) Math.floor(Math.random() * breedList.length));
                int randomCuteness = ((int) Math.floor(Math.random() * 10) + 1);

                parkAnimals obj = new parkAnimals(randomCuteness, randomAge, nameList[randomName], breedList[randomBreed]);
                System.out.println("Animal #" + i + " = " + obj.name);
                System.out.println("Animal Cuteness = " + obj.cuteness);
                System.out.println("Species = " + obj.breed);
                System.out.println("Age = " + randomAge);
                obj.calculateHumanAge();
                System.out.println(" ");

            }
        }

}

public class parkAnimals extends Animal{
    public static String[] breedList = {"Pigeon", "Plane", "Superman", "Deer", "Pizza", "Peregrine Falcon", "Stork", "Seagull", "Raccoon", "Squirrel"};

    public static String[] nameList = {"Geremy", "Gerald", "Geoffry", "Rover", "Ethan", "Victor", "Terrance", "Jeremy", "Justin", "Just-in"};

    public parkAnimals(int cuteness, String name, String breed) {
        super(cuteness, name, breed);

    }

        public static void randomCritters() {
            int critterNum = ((int) Math.floor(Math.random() * nameList.length));
            System.out.println("You also found other animals!!!");

            for (int i = 1; i <=critterNum; i++) {
                int randomName = ((int) Math.floor(Math.random() * nameList.length));
                int randomBreed = ((int) Math.floor(Math.random() * breedList.length));
                int randomCuteness = ((int) Math.floor(Math.random() * 10) + 1);

                parkDog obj = new parkDog(randomCuteness, nameList[randomName], breedList[randomBreed]);
                System.out.println("Animal #" + i + " = " + obj.name);
                System.out.println("Animal Cuteness = " + obj.cuteness);
                System.out.println("Species = " + obj.breed);
                System.out.println(" ");

            }
        }
}

package Gallows;

public class ConstructionOfGallows {
    public void construction(int numberOfErrors){//не здесь идёт просто построение виселицы. Для этого я передаю в качестве параметра количество ошибок, которое считается в main и дальше по твоему совету прописал switch-case
        switch(numberOfErrors){
            case 1:
                System.out.println("____");
                break;
            case 2:
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
                break;
            case 3:
                System.out.println("   ______");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
                break;
            case 4:
                System.out.println("   ______");
                System.out.println("  |   |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
                break;
            case 5:
                System.out.println("   ______");
                System.out.println("  |   |");
                System.out.println("  |   O");
                System.out.println("  |");
                System.out.println("__|__");
                break;
            case 6:
                System.out.println("   ______");
                System.out.println("  |   |");
                System.out.println("  |   O");
                System.out.println("  |   |");
                System.out.println("__|__");
                break;
            case 7:
                System.out.println("   ______");
                System.out.println("  |   |");
                System.out.println("  |   O");
                System.out.println("  |  /|");
                System.out.println("__|__");
                break;
            case 8:
                System.out.println("   ______");
                System.out.println("  |   |");
                System.out.println("  |   O/");
                System.out.println("  |  /|");
                System.out.println("__|__");
                break;
            case 9:
                System.out.println("   ______");
                System.out.println("  |   |");
                System.out.println("  |   O/");
                System.out.println("  |  /|");
                System.out.println("__|__/");
                break;
            case 10:
                System.out.println("   ______");
                System.out.println("  |   |");
                System.out.println("  |   O/");
                System.out.println("  |  /|");
                System.out.println("__|__/ |");
                break;
        }
    }
}

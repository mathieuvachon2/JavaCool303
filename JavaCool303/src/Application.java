import JavaCool303.*; // importing my package

import java.awt.*;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // 2 roots. This can be changed
        int rootNbr = 2;

        // Pastel is the choice, TO CHANGE THEME CHANGE HERE
        System.out.println("Pick between theme 'pastel' and 'summer'");
        String themeChoice = "pastel";

        if(themeChoice.equals("pastel")){
            Cool303WindowPastel frame = new Cool303WindowPastel();
            frame.addRoots(rootNbr,frame );

            // 20 Buttons per box
            int nbrButtons = 20;

            // Setting number of boxes per root (1 in this case)
            for (int root_counter = 0; root_counter < rootNbr; root_counter++) {
                Cool303RootPastel currentRoot = frame.getPastelRoots().get(root_counter);
                currentRoot.setThemeColor();
                int boxNbr = 1;
                currentRoot.addBoxes(boxNbr);

                // I change the size, can change this
                String sizeOption = "yes";
                if(sizeOption.equals("yes")){
                    int width = 550;
                    int height = 550;
                    if(width >= currentRoot.getWidth() && height >= currentRoot.getHeight()) currentRoot.resizeRoot(width,height );
                }

                // Set title and color, this can be changed
                for (int box_counter = 0; box_counter < boxNbr; box_counter++){
                    Cool303BoxPastel currentBox = currentRoot.getBoxPastelList().get(box_counter);
                    currentBox.setThemeColor();
                    String titleDecision = "yes";

                    if (titleDecision.equals("yes")){
                        System.out.println("What is the title");
                        String title = "Title";
                        currentBox.setTitle(title);
                    }

                    System.out.println("Type 'yes' if you want to add a background");
                    String backgroundDecision = "yes";

                    if (backgroundDecision.equals("yes")){
                        System.out.println("What is the Color");
                        String background = "cyan";
                        Color backgroundColor = null; // Converts from String to Color
                        try {
                            backgroundColor = (Color) Color.class.getField(background).get(null);
                            currentBox.setBackgroundColor(backgroundColor);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (NoSuchFieldException e) {
                            System.out.println("That is not a valid color; no background added");
                        }
                    }

                    // Adding the buttons
                    currentBox.addButtons(nbrButtons);
                }
            }

            frame.setVisible(true);

        }
        if(themeChoice.equals("summer")){
            Cool303WindowSummer frame = new Cool303WindowSummer();
            frame.addRoots(rootNbr,frame );

            // 20 Buttons per box
            int nbrButtons = 20;

            // Setting number of boxes per root (1 in this case)
            for (int root_counter = 0; root_counter < rootNbr; root_counter++) {
                Cool303RootSummer currentRoot = frame.getSummerRoots().get(root_counter);
                currentRoot.setThemeColor();
                int boxNbr = 1;
                currentRoot.addBoxes(boxNbr);

                // I change the size, can change this
                String sizeOption = "yes";
                if(sizeOption.equals("yes")){
                    int width = 550;
                    int height = 550;
                    if(width >= currentRoot.getWidth() && height >= currentRoot.getHeight()) currentRoot.resizeRoot(width,height );
                }

                // Set title and color, this can be changed
                for (int box_counter = 0; box_counter < boxNbr; box_counter++){
                    Cool303BoxSummer currentBox = currentRoot.getBoxSummerList().get(box_counter);
                    currentBox.setThemeColor();
                    String titleDecision = "yes";

                    if (titleDecision.equals("yes")){
                        System.out.println("What is the title");
                        String title = "Title";
                        currentBox.setTitle(title);
                    }

                    System.out.println("Type 'yes' if you want to add a background");
                    String backgroundDecision = "yes";

                    if (backgroundDecision.equals("yes")){
                        System.out.println("What is the Color");
                        String background = "cyan";
                        Color backgroundColor = null; // Converts from String to Color
                        try {
                            backgroundColor = (Color) Color.class.getField(background).get(null);
                            currentBox.setBackgroundColor(backgroundColor);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (NoSuchFieldException e) {
                            System.out.println("That is not a valid color; no background added");
                        }
                    }

                    // Adding the buttons
                    currentBox.addButtons(nbrButtons);
                }
            }

            frame.setVisible(true);
        }
        if(themeChoice.equals("")){ // if theme is null, then throw an exception
            throw new Exception("You have to specify a theme");
        }

    }
}

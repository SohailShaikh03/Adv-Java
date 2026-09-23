package Controller;

import java.util.Scanner;

import POJO.Game_cafe;
import Services.Game_services;

public class GameCafe {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Game_services gs = new Game_services();

        int ch;

        do {

            System.out.println("====================");
            System.out.println("----- Game Cafe -----");
            System.out.println("====================");

            System.out.println();
            System.out.println("1. Register for new Gaming Session");
            System.out.println("2. Update your name");
            System.out.println("3. Delete your Session");
            System.out.println("4. Search by ID");
            System.out.println("5. Fetch details");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice -> ");
            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

            case 1:

                System.out.print("Enter Customer Name: ");
                String name = sc.nextLine();

                System.out.print("Enter PC No: ");
                int pc = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Game Name: ");
                String game = sc.nextLine();

                System.out.print("Enter Duration: ");
                int duration = sc.nextInt();

                System.out.print("Enter Amount: ");
                float amount = sc.nextFloat();
                sc.nextLine();

                Game_cafe gc = new Game_cafe();

                gc.setCustomer_name(name);
                gc.setPc_no(pc);
                gc.setGame_name(game);
                gc.setDuration(duration);
                gc.setAmount(amount);

                gs.insertData(gc);

                break;


            case 2:

                Game_cafe updateGc = new Game_cafe();

                System.out.print("Enter Session ID: ");
                int updateId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter New Customer Name: ");
                String newName = sc.nextLine();

                updateGc.setSession_id(updateId);
                updateGc.setCustomer_name(newName);

                gs.updateData(updateGc);

                break;


            case 3:

                Game_cafe deleteGc = new Game_cafe();

                System.out.print("Enter Session ID to delete: ");
                int deleteId = sc.nextInt();
                sc.nextLine();

                deleteGc.setSession_id(deleteId);

                gs.deleteData(deleteGc);

                break;


            case 4:

                Game_cafe searchGc = new Game_cafe();

                System.out.print("Enter Session ID to search: ");
                int searchId = sc.nextInt();
                sc.nextLine();

                searchGc.setSession_id(searchId);

                gs.search(searchGc);

                break;


            case 5:

                Game_cafe fetchGc = new Game_cafe();

                gs.fetchData(fetchGc);

                break;


            case 6:

                System.out.println("Thank you for using Game Cafe!");
                break;


            default:

                System.out.println("Invalid Choice!");

                break;
            }

        } while (ch != 6);

        sc.close();
    }
}
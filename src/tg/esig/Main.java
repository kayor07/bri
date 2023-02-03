package tg.esig;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Main {

   // public static String main(String[] args) throws IOException {


        //public class ReadingFromFile {

            public static void main(String[] args) throws Exception {

                /*System.out.println("Entrez le nom de l'utilisateur:");
                Scanner Userscan = new Scanner(System.in);
                String userName = Userscan.nextLine();

               /* FileReader doc = new FileReader("C:\\Users\\A2KA\\Downloads\\dislaurine.txt");
                int line;
                while ((line=doc.read()) != -1){
                    if (line.contains(userName))
                    System.out.print((char) line);
                }*/
                System.out.print("Entrez le nom de l'utilisateur à analyser : ");
                Scanner Userscan = new Scanner(System.in);
                String userName = Userscan.nextLine();


                // Initialise les compteurs à 0
                int totalMessages = 0;
                int lolCount = 0;
                int lmaoCount = 0;
                int emojiCount = 0;
                int curseCount = 0;
                int receivedEmojiCount = 0;
                int angryEmojiCount = 0;
                int amenCount = 0;
                int akpeCount = 0;
                int merciCount = 0;
                int nagodeCount = 0;
                int imelaCount = 0;
                int thanksCount = 0;
                int thankYouCount = 0;
                int alhamdulillahCount = 0;
                int shukranCount = 0;

                try {
                    // Ouvre le fichier d'historique WhatsApp
                    BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\A2KA\\Downloads\\dislaurine.txt"));

                    // Lit chaque ligne du fichier
                    String line;
                    while ((line = reader.readLine()) != null) {
                        // Vérifie si la ligne contient le nom de l'utilisateur
                        if (line.contains(userName + " :")) {
                            totalMessages++; // Incrémente le compteur de messages

                            // Recherche les occurrences de "lol"
                            if (line.contains("lol")) {
                                lolCount++;
                            }

                            // Recherche les occurrences de "lmao"
                            if (line.contains("lmao")) {
                                lmaoCount++;
                            }

                            // Recherche les occurrences d'emoji
                            if (line.matches(".*[\\uD83C-\\uDBFF\\uDC00-\\uDFFF].*")) {
                                emojiCount++;
                            }

                            // Recherche les occurrences de grossièretés
                            if (line.contains("fuck") || line.contains("merde") || line.contains("putain") || line.contains("ass")) {
                                curseCount++;
                            }

                            // Recherche les occurrences de "amen", "akpe", "merci", "nagode", "imela", "thanks", "thank you", "alhamdulillah" et "shukran"
                            if (line.contains("amen")) {
                                amenCount++;
                            }
                            if (line.contains("akpe")) {
                                akpeCount++;
                            }
                            if (line.contains("merci")) {
                                merciCount++;
                            }
                            if (line.contains("nagode")) {
                                nagodeCount++;
                            }

                            if (line.contains("imela")) {
                                imelaCount++;
                            }
                            if (line.contains("thanks")) {
                                thanksCount++;
                            }
                            if (line.contains("thank you")) {
                                thankYouCount++;
                            }
                            if (line.contains("alhamdulillah")) {
                                alhamdulillahCount++;
                            }
                            if (line.contains("shukran")) {
                                shukranCount++;
                            }
                        }

                        // Vérifie si la ligne contient un message reçu contenant un emoji
                        if (line.matches(".*[\\uD83C-\\uDBFF\\uDC00-\\uDFFF].*") && !line.contains(userName + " :")) {
                            receivedEmojiCount++; // Incrémente le compteur d'emoji reçus
                        }

                        // Vérifie si la ligne contient un message reçu contenant l'emoji 😡
                        if (line.contains("😡") && !line.contains(userName + " :")) {
                            angryEmojiCount++; // Incrémente le compteur d'emoji 😡 reçus
                        }
                    }

                    // Ferme le fichier
                    reader.close();

                    // Affiche les résultats
                    System.out.println("Nombre total de messages envoyés : " + totalMessages);
                    System.out.println("Nombre total de fois où l'utilisateur a envoyé \"lol\" : " + lolCount);
                    System.out.println("Nombre total de fois où l'utilisateur a envoyé \"lmao\" : " + lmaoCount);
                    System.out.println("Nombre total de fois où l'utilisateur a envoyé des emojis : " + emojiCount);
                    System.out.println("Nombre total de grossièretés envoyées par l'utilisateur : " + curseCount);
                    System.out.println("Nombre total de fois où l'utilisateur a reçu des emojis : " + receivedEmojiCount);
                    System.out.println("Nombre total de fois où l'utilisateur a reçu l'emoji 😡 en colère : " + angryEmojiCount);
                    System.out.println("Nombre total de fois où l'utilisateur a envoyé et reçu les mots \"amen\" : " + amenCount);
                    System.out.println("Nombre total de fois où l'utilisateur a envoyé et reçu les mots \"akpe\" : " + akpeCount);
                    System.out.println("Nombre total de fois où l'utilisateur a envoyé et reçu les mots \"merci\" : " + merciCount);
                    System.out.println("Nombre total de fois où l'utilisateur a envoyé et reçu les mots \"nagode\" : " + nagodeCount);
                    System.out.println("Nombre total de fois où l'utilisateur a envoyé et reçu les mots \"imela\" : " + imelaCount);
                    System.out.println("Nombre total de fois où l'utilisateur a envoyé et reçu les mots \"thanks\" : " + thanksCount);
                    System.out.println("Nombre total de fois où l'utilisateur a envoyé et reçu les mots \"thank you\" : " + thankYouCount);
                    System.out.println("Nombre total de fois où l'utilisateur a envoyé et reçu les mots \"alhamdulillah\" : " + alhamdulillahCount);
                    System.out.println("Nombre total de fois où l'utilisateur a envoyé et reçu les mots \"shukran\" : " + shukranCount);
                } catch (IOException e) {
                    System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
                }
            }
}





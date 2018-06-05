package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        ArrayList<String> hedges = new ArrayList<>();
        ArrayList<String> qualifiers = new ArrayList<>();
        ArrayList<String> replacements = new ArrayList<>();
        //{"Please tell me more", "Many of my patients tell me the same thing It is
        // getting late, maybe we had better quit"};
        //qualifier = {"Why do you say that", "You seem to think that", "So, you are concerned that"};
        hedges.add("Please tell me more");
        hedges.add("Many of my patients tell me the same thing It is getting late");
        hedges.add("Maybe we better quit");
        hedges.add("I think we should go now");

        qualifiers.add("Why do you say that");
        qualifiers.add("You seem to think that");
        qualifiers.add("So you are concerned that");
        qualifiers.add("You meant to say that");
        qualifiers.add("is that your thought that");

        replacements.add("You");
        replacements.add("your");
        replacements.add("are");

        System.out.println("Welcome to a Therapy store, I am Eliza, How may I help you Today?");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Enter your Response here are or 'Q' to End the chat?");
        String s1 = sc.nextLine();
        String hedg;
        String qualif;

        while (!s1.toLowerCase().equals("q")) {
            String[] input = (s1.split(" "));
            String[] message = new String[input.length];
            if ((s1.contains("I")) || (s1.contains("me")) ||
                    (s1.contains("my")) || (s1.contains("am"))) {

                for (int i = 0; i < input.length; i++) {
                    if (input[i].contains("I")) {
                        input[i] = input[i].replace("I", "you");
                        message[i] = input[i];
                    } else if (input[i].contains("me")) {
                        input[i] = input[i].replace("me", "you");
                        message[i] = input[i];
                    } else if (input[i].contains("my")) {
                        input[i] = input[i].replace("my", "your");
                        message[i] = input[i];
                    } else if (input[i].contains("am")) {
                        input[i] = input[i].replace("am", "are");
                        message[i] = input[i];
                    }
                        else if (input[i].contains("you")) {
                            input[i] = input[i].replace("you", "me");
                        message[i] = input[i];

                    } else {
                        message[i] = input[i];
                    }
                }
                int i1=rnd.nextInt(qualifiers.size());
                qualif= qualifiers.get(i1);
                System.out.print(qualif);
                for (int i = 0; i < message.length; i++) {
                    System.out.print(" "+ message[i] + " ");
                }
                System.out.print("?");
                System.out.println("\n-----------------------------------------------------------------");
                System.out.println("Enter your Response here are or 'Q' to End the chat?");
                s1 = sc.nextLine();

            }

                else {
                int ind = rnd.nextInt(hedges.size());
                hedg =hedges.get(ind) ;
                System.out.println(hedg);
                System.out.println("\n-----------------------------------------------------------------");
                System.out.println("Enter your Response here are or 'Q' to End the chat?");
                s1 = sc.nextLine();
                }

            }

        System.out.println("thank you");
        }

    }



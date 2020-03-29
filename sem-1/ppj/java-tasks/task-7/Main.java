package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(norm("caravaggio"));
        System.out.println(norm("VERMEER"));
        System.out.println(init("johann sebastian bach lol kek"));
        System.out.println(init("i. babeL"));
        System.out.println(init("jorge LUIS BORGES"));
        System.out.println(init("WOLFGANG a. mozart"));
        System.out.println(tr("November 2016", "abcdefghijklmnopqrstuvwyz", "ABCDEFGHIJKLMNOPQRSTUVWYZ"));
        System.out.println(tr("abcXYZ", "aZcX", "||Cx"));
    }

    public static String norm(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public static String init(String name) {
        String[] inputName = name.split(" ");
        String finalName = "";
        for (int i = 0; i < inputName.length; i++) {
            if (i != inputName.length - 1) {
                finalName += inputName[i].substring(0, 1).toUpperCase() + ". ";
                continue;
            }
            finalName += norm(inputName[i]);
        }
        return finalName;
    }

    public static String tr(String s, String from, String to) {
        for (int i = 0; i < s.length(); i++) {
            char currentLetter = s.charAt(i);
            int index = from.indexOf(currentLetter);
            if (index > -1) {
                s = s.replace(currentLetter, to.charAt(index));
            }
        }
        return s;
    }





}

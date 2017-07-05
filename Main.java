package Moonbugs;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Ryan> ryan = new ArrayList<>();
        ryan.add(new Ryan("Ryan", "Guitar", "Vocals"));
        ryan.add(new Carlo("Carlo", "Synth and noise", "NA"));
        ryan.add(new Anthony("Anthony", "Drums", "Backup"));
        ryan.add(new Loyd("Loyd", "Guitar", "Backup"));
        ryan.add(new Aldene("Aldene", "Bass", "backup"));

        System.out.println("The Moonbugs");
        System.out.println(ryan.toString());
    }
}


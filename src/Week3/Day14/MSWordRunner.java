package Week3.Day14;

class MSWord extends Thread {

    @Override
    public void run() {
        if (getName().equals("TYPE")) {
            type();
        } else if (getName().equals("AUTOSAVE")) {
            autoSave();
        } else {
            spellCheck();
        }
    }

    void type() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Typing...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void autoSave() {
        for (;;) {
            System.out.println("Saving...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void spellCheck() {
        for (;;) {
            System.out.println("Spell Checking...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MSWordRunner {

    public static void main(String[] args) {
        MSWord ms1 = new MSWord();
        MSWord ms2 = new MSWord();
        MSWord ms3 = new MSWord();

        ms1.setName("TYPE");
        ms2.setName("AUTOSAVE");
        ms3.setName("SPELLCHECK");

        ms2.setDaemon(true);
        ms3.setDaemon(true);

        ms2.setPriority(8);
        ms3.setPriority(9);

        ms1.start();
        ms2.start();
        ms3.start();
    }
}

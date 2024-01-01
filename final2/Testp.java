package final2;

public class Testp {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MyPanel panel = new MyPanel();
                panel.setVisible(true);
            }
        });
    }
}

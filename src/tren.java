class tren {
    public  static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if (x < y) System.out.println("Знaчeниe х меньше у ");

        x = x * 2;
        if (x == y) System.out.println("Tenepь значение х равно у ");
        x = x * 2;

        if (x > y) System.out.println("Teпepь значение х больше у ");
// Здесь ничего не отобразится
        if (x == y) System.out.println("Этoт вывод вы не увидите ");
    }

}



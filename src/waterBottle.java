class Waterbottle {
    private String brand;
    private String material;

    public String yourBottle() {
        return String.format("You have a %s %s water bottle!", brand, material);
    }

    public static void main(String[] args) {
        Waterbottle nadia = new Waterbottle();
        nadia.brand = "Klean Kanteen";
        nadia.material = "Stainless Steel";
        System.out.println(nadia.yourBottle());

        Waterbottle elle = new Waterbottle();
        elle.brand = "Smart Water";
        elle.material = "Plastic";
        System.out.println(elle.yourBottle());

        Waterbottle carson = new Waterbottle();
        carson.brand = "Unrecognizable brand";
        carson.material = "Blue plastic";
        System.out.println(carson.yourBottle());

        Waterbottle alexandra = new Waterbottle();
        alexandra.brand = "Klean Kanteen";
        alexandra.material = "Blue sky stainless steel";
        System.out.println(alexandra.yourBottle());

        Waterbottle sam = new Waterbottle();
        sam.brand = "Contigo";
        sam.material = "Orange plastic";
        System.out.println(sam.yourBottle());

    }
}

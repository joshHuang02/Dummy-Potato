public class AnimalTester
{
    public static void main()
    {
        Ewok firstEwok = new Ewok("George", 1);
        System.out.println(firstEwok.panic());
        firstEwok.visitHospital();
        System.out.println(firstEwok.blink());
        System.out.println();

        System.out.println("Josh Huang:");
        //Josh Huang
        Goat goart1JH = new Goat(2, true);
        System.out.println(goart1JH.revive());
        System.out.println(goart1JH.chowSomeGrass());
        System.out.println(goart1JH.dash());
        System.out.println(goart1JH.listenUp());
        System.out.println();

        Worm worm1JH = new Worm("Purple", true);
        System.out.println(worm1JH.restore());
        System.out.println(worm1JH.consume());
        System.out.println(worm1JH.wiggle());
        System.out.println(worm1JH.thinkAboutLife());
        System.out.println();

        Penguin penguin1JH = new Penguin("Megatron", 2, true);
        System.out.println(penguin1JH.goToHospital());
        System.out.println(penguin1JH.swim());
        System.out.println(penguin1JH.eat());
        System.out.println(penguin1JH.waddle());
        System.out.println(penguin1JH.jump());
        //Josh Huang
    }
}
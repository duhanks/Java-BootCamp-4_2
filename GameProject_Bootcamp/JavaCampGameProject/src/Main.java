import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        User user1=new User(1,"Sadik","12345678912", LocalDate.of(2001, 2, 16));

        UserManager userManager=new UserManager(new EdevletManager());
        userManager.register(user1);
        userManager.login(user1);
        userManager.delete(user1);

        Campaign campaing1=new Campaign(1,"indirim",45);

        CampaignManager campaignManager=new CampaignManager();
        campaignManager.add(campaing1);
        campaignManager.delete(campaing1);
        campaignManager.update(campaing1);

        Game game1=new Game(1,"PES",400);

        GameManager gameManager=new GameManager();
        gameManager.add(game1);
        gameManager.delete(game1);
        gameManager.update(game1);

        gameManager.campaing(campaing1, game1);



    }
}
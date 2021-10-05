/*
 * Name      :Masum Ahmed
 * ID        :2012020116
 * Section   :C
 * Batch     :53
 * email     :cse_2012020116@lus.ac.bd
 * Date      :09.09.21
 */
package masum;

public class Cricket extends Sports {
    String matchType;
    int over;
    Player player;
    Cricket(String matchType, int over,  Player player)
    {
        this.matchType=matchType;
        this.over=over;
        this.player= player;
    }


    void display()
    {
        System.out.println("Match type                      :"+matchType);
        System.out.println("Total over                      :"+over);
        System.out.println("Name of the player              :" +player.playerName );
        System.out.println("Jersey number of the player     :" +player.jerseyNumber );



    }

}

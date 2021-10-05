/*
* Name      :Masum Ahmed
* ID        :2012020116
* Section   :C
* Batch     :53
* email     :cse_2012020116@lus.ac.bd
* Date      :09.09.21
 */

package masum;

public class Main {

        public static void main(String[] args) {
            Player player=new Player("Shakib", 75);
            Cricket cricket=new Cricket("International match",20, player);
            cricket.display();
            Football football=new Football();
        }
}

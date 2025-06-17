// Card.java
// @SebastianFrazier26
// Card class representing a bingo card for famgo game

public class Card {

        public int dimensions;
        public String[][] card;

        public Card(int dimensions) {
                if (dimensions < 3 || dimensions > 5) {
                        throw new IllegalArgumentException("Dimensions must be between 3 and 5.");
                }
                this.dimensions = dimensions;

                this.card = new String[dimensions][dimensions];
                for (int i = 0; i < dimensions; i++) {
                        for (int j = 0; j < dimensions; j++) {
                                card[i][j] = "";
                        }
                }
        }

        public void displayCard() {
                for (int i = 0; i < dimensions; i++) {
                        for (int j = 0; j < dimensions; j++) {
                                System.out.print(card[i][j]);
                        }
                }
        }
}
public class Room {
        private String password;
        private String name;
        private Player[] members;
        public Topic[] bank;
        public Card card;

        public Room(String name, String password) {
                this.name = name;
                this.password = password;                
        }
}


import java.util.ArrayList;

public class Player {
        public String name;
        public Color color;
        public ArrayList<Topic> topics;

        public Player(String name, Color color) {
                this.name = name;
                this.color = color;
                this.topics = new ArrayList<>();
        }

        public void addTopic(String name, Topic new_topic) {
                this.topics.add(new_topic);
        }

        public void removeTopic(String name, Topic old_topic) {
                this.topics.remove(old_topic);
        }
}

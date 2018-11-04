package vce.com.newvsv;

public class Placement {
    String comapany,que,ans, topic, round;
    float rating;
    boolean selected;

    public Placement() {
    }

    public Placement(String comapany, String que, String ans, String topic, String round, float rating, boolean selected) {
        this.comapany = comapany;
        this.que = que;
        this.ans = ans;
        this.topic = topic;
        this.round = round;
        this.rating = rating;
        this.selected = selected;
    }

    public String getComapany() {
        return comapany;
    }

    public void setComapany(String comapany) {
        this.comapany = comapany;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
package Day05;

public class TrafficLight {

    String color;
    Integer duration;

    TrafficLight(String color, Integer duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }

    public boolean isRed() {
        return color.equals("red");
    }

    public boolean isGreen() {
        return color.equals("green");
    }

    public boolean isYellow() {
        return color.equals("yellow");
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public static void main(String[] args) {
        TrafficLight tr = new TrafficLight("red", 20);

        System.out.println("Ligth is red : "+ tr.isRed());
        System.out.println("duration is : "+ tr.getDuration());
        System.out.println("Light is green : "+ tr.isGreen());
        System.out.println("Light is yellow : "+ tr.isYellow());

        System.out.println("After changing color...........");
        tr.changeColor("green");
        tr.setDuration(12);

        System.out.println("Light is green :"+ tr.isGreen());
        System.out.println("duration is : "+ tr.getDuration());
        System.out.println("Light is red : "+ tr.isRed());
        System.out.println("Light is yellow : "+ tr.isYellow());

        System.out.println("Again Changing color green to yellow .........");
        tr.changeColor("yellow");
        tr.setDuration(18);

        System.out.println("Light is yellow : "+ tr.isYellow());
        System.out.println("duration is : "+ tr.getDuration());
        System.out.println("Light is red : "+ tr.isRed());
        System.out.println("Light is green : "+ tr.isGreen());


    }
}

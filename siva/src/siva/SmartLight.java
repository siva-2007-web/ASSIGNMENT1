package siva;

class SmartLight {
    private int brightness; // range: 0 to 100
    private String color;   // e.g., Warm, Cool, Neutral

    // Default constructor (no arguments)
    public SmartLight() {
        this.brightness = 50;  // Default brightness
        this.color = "Warm";   // Default color
        System.out.println("SmartLight created with default settings: Brightness 50%, Color Warm");
    }

    // Parameterized constructor (set brightness and color at creation)
    public SmartLight(int brightness, String color) {
        // use the setBrightness method for safe brightness assignment
        setBrightness(brightness);
        this.color = color;
        System.out.println("SmartLight created with custom settings: Brightness " + this.brightness + "%, Color " + this.color);
    }

    // Overloaded Method 1: Set brightness by percentage
    public void setBrightness(int percent) {
        if (percent < 0) {
            brightness = 0;
        } else if (percent > 100) {
            brightness = 100;
        } else {
            brightness = percent;
        }
        System.out.println("Brightness set to " + brightness + "%");
    }

    // Overloaded Method 2: Set brightness by predefined modes
    public void setBrightness(String mode) {
        switch (mode.toUpperCase()) {
            case "LOW":
                brightness = 25;
                break;
            case "MEDIUM":
                brightness = 50;
                break;
            case "HIGH":
                brightness = 100;
                break;
            default:
                System.out.println("Invalid mode. Use LOW, MEDIUM, or HIGH.");
                return;
        }
        System.out.println("Brightness set to " + mode + " (" + brightness + "%)");
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
        System.out.println("Color set to " + this.color);
    }

    // Getter for brightness
    public int getBrightness() {
        return brightness;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        // Using default constructor
        SmartLight light1 = new SmartLight();
        light1.setBrightness(80);       // by percentage
        light1.setBrightness("LOW");    // by mode
        light1.setColor("Cool");        // change color

        System.out.println("Light1 final state: Brightness " + light1.getBrightness() + "%, Color " + light1.getColor());

        // Using parameterized constructor
        SmartLight light2 = new SmartLight(90, "Neutral");
        light2.setBrightness("HIGH");   // set mode
        light2.setColor("Warm");        // set new color

        System.out.println("Light2 final state: Brightness " + light2.getBrightness() + "%, Color " + light2.getColor());
    }
}



package eternal.fire.GUI;

public class GUI {
    public static void printIcon() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(".____    ._____.                                 _________.__              .__          __                \n" +
                "|    |   |__\\_ |______________ _______ ___.__.  /   _____/|__| _____  __ __|  | _____ _/  |_  ___________ \n" +
                "|    |   |  || __ \\_  __ \\__  \\\\_  __ <   |  |  \\_____  \\ |  |/     \\|  |  \\  | \\__  \\\\   __\\/  _ \\_  __ \\\n" +
                "|    |___|  || \\_\\ \\  | \\// __ \\|  | \\/\\___  |  /        \\|  |  Y Y  \\  |  /  |__/ __ \\|  | (  <_> )  | \\/\n" +
                "|_______ \\__||___  /__|  (____  /__|   / ____| /_______  /|__|__|_|  /____/|____(____  /__|  \\____/|__|   \n" +
                "        \\/       \\/           \\/       \\/              \\/          \\/                \\/                   ");
        System.out.println();
        System.out.println();
    }
    public static void printWelcomeGUI() {
        printIcon();
        System.out.println("              欢迎使用“图书馆管理系统模拟器”");
        System.out.println("1.输入1进入登录界面\n" +
                "2.输入2以游客身份访问\n" +
                "3.输入3进入注册界面\n" +
                "输入-1退出模拟器");
    }

    public static void printLoginGUI() {
        printIcon();
        System.out.println("1.输入1以普通用户身份登录\n" +
                "2.输入2以管理员身份登录\n" +
                "3.输入3返回主界面\n");
    }
}

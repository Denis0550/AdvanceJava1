public class InterfaceDefault {
    public static void main(String[] args) {

        BrowserChrome chrome = new BrowserChrome();
        chrome.clicked();
        chrome.rightClicked();

        System.out.println("==============================");

        WindowsDesktop windows = new WindowsDesktop();
        windows.clicked();
        windows.rightClicked();

        System.out.println("==============================");
        //polymorphism
        OS_MouseClicks chromeX = new BrowserChrome();
        chromeX.clicked();
        chromeX.rightClicked();

    }
}

interface OS_MouseClicks {
    void clicked();
    default void rightClicked() {
        System.out.println("Default Menu....");
    }
}



class BrowserChrome implements OS_MouseClicks {
    @Override
    public void clicked() {
        System.out.println("You are in a Browser... ");
    }

    //comment this method out to see default method getting called
    @Override
    public void rightClicked() {
        System.out.println("Back | Forward | Reload");
    }
}

class WindowsDesktop implements OS_MouseClicks {
    @Override
    public void clicked() {
        System.out.println("You are on your Desktop... ");
    }

    @Override
    public void rightClicked() {
        System.out.println("View | Sort By | Refresh");
    }
}

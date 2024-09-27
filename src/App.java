public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("App Addition");

        UIConsoleOutput output = new UIConsoleOutput();
        UIConsoleInput input = new UIConsoleInput();
        AddUseCaseControl control = new AddUseCaseControl(output, input);

        control.execute();
    }
}
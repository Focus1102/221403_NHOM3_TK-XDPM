import java.io.*;

public class UIConsoleInput {
    private PrintWriter stdout;
    private BufferedReader stdin;

    public UIConsoleInput() {
        stdout = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), true);
        stdin = new BufferedReader(new InputStreamReader(System.in));
    }

    public RequestData input() throws IOException {
        RequestData requestData = new RequestData();

        stdout.print("Number 1: ");
        stdout.flush();
        requestData.number1 = stdin.readLine();


        stdout.print("Number 2: ");
        stdout.flush();
        requestData.number2 = stdin.readLine();

        return requestData;
    }
}

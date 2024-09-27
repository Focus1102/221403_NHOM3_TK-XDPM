import java.io.IOException;

public class AddUseCaseControl {
    private UIConsoleOutput output;
    private UIConsoleInput input;

    public AddUseCaseControl(UIConsoleOutput output, UIConsoleInput input) {
        this.output = output;
        this.input = input;
    }

    public void execute() throws IOException {
        RequestData reqData;
        boolean validInput = false;

        while (!validInput) {
            reqData = input.input(); // Nhập dữ liệu từ người dùng

            try {
                int num1 = Integer.parseInt(reqData.number1); // Kiểm tra số thứ nhất
                int num2 = Integer.parseInt(reqData.number2); // Kiểm tra số thứ hai

                AddEntity addEntity = new AddEntity(num1, num2);
                int result = addEntity.add();
                
                ResponseData responseData = new ResponseData(result, "Thanh Cong");
                output.Response(responseData);
                validInput = true; // Nếu không có ngoại lệ, thiết lập validInput là true
            } catch (NumberFormatException e) {
                output.showResponseError(); // Hiển thị thông báo lỗi 
                // Không cần yêu cầu nhập lại, vòng lặp sẽ tự động lặp lại
            }
        }
    }
}

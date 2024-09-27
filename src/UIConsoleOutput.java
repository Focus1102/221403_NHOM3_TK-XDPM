public class UIConsoleOutput {
    public void Response(ResponseData responseData) {
        System.out.println(responseData.getMessage());
        System.out.println("Ket qua: " + responseData.getResult());
    }

    public void showResponseError() {
        System.out.println("Nhap sai. Vui long nhap lai");
        
    }
}

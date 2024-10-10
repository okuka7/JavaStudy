package enumeration.test.http;

public enum HttpStatus {
    //코드 작성
    OK(200,"OK"),
    BAD_REQUST(400,"Bad Request"),
    NOT_FOUNT(404,"Not Found"),
    INTERNAL_SERVER_ERROR(500,"Internal Server Error");

    private final int code;
    private final String message;
    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus finByCode(int code) {
        for (HttpStatus status : values()) {
            if(status.getCode() == code){
                return status;
            }
        }
        return null;
    }

    public boolean isSuccess(){
        return code >= 200 && code <=299;

    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

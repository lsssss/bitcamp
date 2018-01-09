package java100.app.dao;

import java100.app.domain.UploadFile;

public interface FileDao {
    // insert/update/delete 개수를 리턴하고 싶다면 리턴 타입을 int로 선언한다.
    // 굳이 리턴할 이유가 없다면 void로 선언해도 된다.
    void insert(UploadFile file);
    void deleteAllByBoardNo(int no);
}

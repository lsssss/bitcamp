package java100.app.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java100.app.dao.BoardDao;
import java100.app.dao.FileDao;
import java100.app.domain.Board;
import java100.app.domain.UploadFile;
import java100.app.service.BoardService;


@Service
public class BoardServiceImpl implements BoardService{

    @Autowired BoardDao boardDao;
    @Autowired FileDao fileDao;
    
    @Override
    public List<Board> list(int pageNo, int pageSize, Map<String, Object> options) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("startIndex", (pageNo-1) * pageSize);
        params.put("size", pageSize);
        if (options != null) {
            options.putAll(options);
        }
        return boardDao.findAll(params);
        
    }
    
    
    @Override
    public Board get(int no) {
        
        // 게시물의 첨부 파일 정보를 가져올 때 
        // 방법1: 
        // => 따로 따로 가져오기 
        //Board board = boardDao.findByNo(no);
        //board.setFiles(fileDao.findByBoardNo(no));
        
        // 방법2:
        // => board 객체에 묶어서 가져오기
        Board board = boardDao.findByNo2(no);
        
        return board;
    }
    
    @Override
    public int getTotalCount() {
        return boardDao.countAll();
    }
    
    @Override
    public int updateViewCount(int no) {
        return boardDao.updateViewCount(no);
    }


    @Override
    public int add(Board board) {
        
      
        
        
        int count = boardDao.insert(board);
        
        List<UploadFile> files =board.getFiles();
        
        for(UploadFile file : files) {
            //file.setBoardNo(board.getNo());
            fileDao.insert(file);
        }
        
        return count;
    }

    @Override
    public int update(Board board) {
        
        int count =  boardDao.update(board);
        
        
        fileDao.deleteAllByBoardNo(board.getNo());
        List<UploadFile> files =board.getFiles();
        
        for(UploadFile file : files) {
            file.setBoardNo(board.getNo());
            fileDao.insert(file);
        }
        
        
        
        return count;
        
    }

    @Override
    public int delete(int no) {
       // fileDao.deleteAllByBoardNo(no);
        return boardDao.delete(no);
       
       
    }




    
    
}

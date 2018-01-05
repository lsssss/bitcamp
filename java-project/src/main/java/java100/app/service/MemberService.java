package java100.app.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import java100.app.domain.Member;
@Service
public interface MemberService {

    List<Member> list(int pageNo, int pageSize, Map<String,Object> options);
    Member get(int no);
    int add(Member member);
    int update(Member member);
    int delete(int no);
    int getTotalCount();
    Member findByEmailAndPassword(Map<String,Object> params);
    
}

package com.sparta.week03.service;

import com.sparta.week03.domain.Memo;
import com.sparta.week03.domain.MemoRepository;
import com.sparta.week03.domain.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor    //  final을 사용하기 위해 사용
@Service
public class MemoService {

    private final MemoRepository memoRepository;    //  final을 이용해서 꼭 필요한 것을 표시

    /*update 메소드*/
    @Transactional  //  update 할 때 db에 반영되도록 사용
    public Long updateMemo(Long id, MemoRequestDto requestDto) {
        Memo memo = memoRepository.findById(id).orElseThrow(    //  udpate 하기 위해 findById를 먼저 실행 후 Memo memo 반환
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")   //  id가 존재하지 않을 경우 알림
        );
        memo.update(requestDto);    //  memo를 requestDto로 update
        return memo.getId();    //  update된 id 반환
    }
}
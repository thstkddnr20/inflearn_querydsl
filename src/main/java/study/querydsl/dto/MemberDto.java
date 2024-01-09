package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberDto {
    private String username;
    private int age;

    @QueryProjection // queryprojection을 넣어줌으로써 MemberDto 자체가 querydsl 의존을 하게 되어 순수 DTO가 아니게 된다. (DTO는 여기저기로 흘러나가기 때문에 순수 DTO여야 좋다)
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }
}

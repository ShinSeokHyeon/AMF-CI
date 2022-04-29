package com.example.amfdemo.service;

import java.util.List;

import com.example.amfdemo.domain.aggregate1.entity.Member;

public interface MemberService {

	// 특정 팀에 속하는 멤버를 조회
	List<Member> findAllMemberByTeamId(Long id);
	
	// 멤버 저장
	Member saveMember(Member member);
	
}

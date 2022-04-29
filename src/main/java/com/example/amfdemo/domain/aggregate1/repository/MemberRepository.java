package com.example.amfdemo.domain.aggregate1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amfdemo.domain.aggregate1.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

	// 특정 팀에 속하는 멤버를 조회
	List<Member> findAllMemberByTeamId(Long Id);
	
}

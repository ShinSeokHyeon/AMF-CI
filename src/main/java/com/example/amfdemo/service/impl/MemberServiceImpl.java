package com.example.amfdemo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.amfdemo.domain.aggregate1.entity.Member;
import com.example.amfdemo.domain.aggregate1.repository.MemberRepository;
import com.example.amfdemo.service.MemberService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {

	private MemberRepository memberRepository;
	
	@Override
	public List<Member> findAllMemberByTeamId(Long id) {
		
		return memberRepository.findAllMemberByTeamId(id);
	}

	@Override
	public Member saveMember(Member member) {
		// TODO Auto-generated method stub
		return memberRepository.save(member);
	}
}

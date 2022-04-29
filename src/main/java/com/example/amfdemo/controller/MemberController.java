package com.example.amfdemo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.amfdemo.domain.aggregate1.entity.Member;
import com.example.amfdemo.service.MemberService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class MemberController {
	
	private final MemberService memberService;
	
	@GetMapping("/members/teams/{teamId}")
	public ResponseEntity<List<Member>> findAllMemberByTeamId(@PathVariable Long teamId){
		
		return ResponseEntity.ok().body(memberService.findAllMemberByTeamId(teamId));
	}
	
	/*
	 * @PostMapping("/members") public ResponseEntity<Member>
	 * saveMember(@RequestBody Member member) {
	 * 
	 * return ResponseEntity.ok().body(memberService.saveMember(member)); }
	 */

}

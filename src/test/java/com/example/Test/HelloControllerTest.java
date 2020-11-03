package com.example.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.Test001Application;

@AutoConfigureMockMvc
@SpringBootTest(classes = Test001Application.class)
public class HelloControllerTest {
	// Tomcat�T�[�o�փf�v���C���邱�ƂȂ�Http���N�G�X�g�E���X�|���X���������߂�Mock�I�u�W�F�N�g
	@Autowired
	private MockMvc mockMvc;
	
	// get���N�G�X�g��View���w�肵�āAHttp�X�e�[�^�X�Ń��N�G�X�g�̐��ۂ𔻒�
	@Test
	public void init������������200���Ԃ�() throws Exception{
		// andDo(print())�Ń��N�G�X�g�E���X�|���X��\��
		this.mockMvc.perform(get("/hello/init")).andDo(print())
		.andExpect(status().isOk());
	}



}

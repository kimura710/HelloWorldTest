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
	// TomcatサーバへデプロイすることなくHttpリクエスト・レスポンスを扱うためのMockオブジェクト
	@Autowired
	private MockMvc mockMvc;
	
	// getリクエストでViewを指定して、Httpステータスでリクエストの成否を判定
	@Test
	public void init処理が走って200が返る() throws Exception{
		// andDo(print())でリクエスト・リスポンスを表示
		this.mockMvc.perform(get("/hello/init")).andDo(print())
		.andExpect(status().isOk());
	}



}

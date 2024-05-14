package com.practice.std.problem.Impl.Permutation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermuattionArrayNumber {
	public List<List<Integer>> stringPermutation = new ArrayList<List<Integer>>();
	

	public boolean isPresent(List<Integer> intArray,List<List<Integer>> finalArray) {
	
		for( List<Integer> s : finalArray) {
			if(s.equals(intArray)) {
				return true;
			}
		}
		
		return  false;
		
	}
	public void genratePermutation(List<Integer> intArray, int l, int r,Set<List<Integer>> finalArray ) {
	
		
		if(l==r-1) {
			
			//if(!isPresent(intArray,finalArray)) {
				finalArray.add(new ArrayList<Integer>(intArray));
			//}
		}else {
			for(int i=l;i<r;i++) {
				intArray = swap(intArray, l, i);
				 genratePermutation(intArray,l+1,r,finalArray);
				 intArray = swap(intArray, l, i);
				
			}
		}
	}


	private List<Integer> swap(List<Integer> intArray, int l, int r) {
		
		
		Integer temp = intArray.get(l);
		intArray.set(l, intArray.get(r)) ;
		intArray.set(r, temp) ;
		
		return intArray;
		
	
	}
	
	public static void main(String args[]) {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(12);
		integers.add(22);
		integers.add(31);
		integers.add(1);
		//print input array
		System.out.println("Input array");
		integers.forEach(s-> System.out.println(s));
		System.out.println("end");
		Set<List<Integer>> finalArray = new HashSet<List<Integer>>();
		PermuattionArrayNumber permuatation = new PermuattionArrayNumber();
		int n = integers.size();
		//finalArray.add(integers);
		permuatation.genratePermutation(integers, 0, n,finalArray);
		System.out.println(finalArray.size());
		//print permuatation array
		finalArray.forEach(s->{
			System.out.println("\n");
			s.forEach(k->System.out.println(k));
		});
		
	}
	
	
}




	private static List<Article> articles = new ArrayList<Article>();
	private static ArticleService service = new ArticleService();

	@Autowired
	private MockMvc mockMvc;

	@BeforeClass
	public static void populateArticles() {
		articles.add(new Article("10 things that you thought were unhealthy"));
		articles.add(new Article("You won't sleep until you read this"));
		articles.add(new Article("I ran out of catchy titles"));
	}

	@Before
	public void clearDB() {
		this.service.clear();
	}

	public void addArticles() {
		for(Article article: articles) {
			this.service.add(article);
		}
	}

	@Test
	public void shouldLetUsPostArticles() throws Exception {
		for(Article article: articles) {
			this.mockMvc.perform(post("/articles")
							.content(asJsonString(article))
							.contentType(MediaType.APPLICATION_JSON)
							.accept(MediaType.APPLICATION_JSON))
					.andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8))
					.andExpect(jsonPath("title", is(article.getTitle())));
		}
	}

	@Test
	public void shouldAllowUpdatingArticles() throws Exception {
		addArticles();
		String body = "This is some filler text for a killer article";
		Article article = this.service.getAll().get(0);
		article.setBody(body);
		this.mockMvc.perform(put("/articles/" + article.getId())
						.content(asJsonString(article))
						.contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isNoContent());
		Article actual = this.service.findById(article.getId());
		assertEquals("Should have updated the article", actual.getBody(), body);
	}

	@Test
	public void shouldAllowUsToRemoveArticles() throws Exception {
		addArticles();
		List<Article> all = new ArrayList<Article>(this.service.getAll());
		for(Article article: all) {
			this.mockMvc.perform(delete("/articles/" + article.getId()))
					.andExpect(status().isNoContent());
		}
		assertEquals("Should remove all articles", 0, this.service.getAll().size());
	}

	public static String asJsonString(final Object obj) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			final String jsonContent = mapper.writeValueAsString(obj);
			return jsonContent;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

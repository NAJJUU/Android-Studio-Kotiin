## view binding
findViewById를 이용해서 xml의 뷰와 변수를 연결시켜주는 작업없이 xml의 view를 이어준다.        

### findViewById의 문제점 

- Null 안정성: 개발자가 실수로 유효하지 않은 id를 사용하면 null 오류가 발생할 수 있다.
- Type 안정성: textView의 타입을 imageView라고 잘못 적어서 캐스팅하면 cast exception이 발생할 수 있다.
- 속도가 상대적으로 느리다.

1. build.gradle(app)            
   : android{} 안에 아래의 코드 추가            
buildFeatures {          
        compose = true        
        viewBinding = true        
    }          
![image](https://github.com/NAJJUU/Android-Studio-Kotiin/assets/122864238/cd34eafc-9df3-4e88-9534-bc8b99d25d66)

2. setContentView(R.layout.activity_main)을 통해 activity와 layout을 연결해줄 필요가 없음          

val binding = ActivityMainBinding.inflate(layoutInflater)            
setContentView(binding.root)          

- binding을 초기화 해준다.                
이때 layout의 이름에 따라 ActivityMainBinding의 이름을 결정해준다.              
-> binding을 통해 activity와 layout을 연결해준다.

- binding.button = binding.view의 id 입력 후 사용가능            
view별로 findViewById로 하나하나 초기화하고 사용할 필요가 없음        

![image](https://github.com/NAJJUU/Android-Studio-Kotiin/assets/122864238/ba880cba-48f7-4d66-8023-16c231d2a8bf)

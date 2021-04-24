#include <iostream>
using namespace std;

int main(){
    int a; cin >> a;
    int b; cin >> b;
    int c; cin >> c;
    int d; cin >> d;
    int s; cin >> s;

    int foo1 = 0;
    int foo2 = 0;
    int foo_3 = 0;
    int foo_4 = 0;

    for(int i =0; i<s;i++){
        if(i%a==0&&i>=a){
            foo1 += b;
        }
        else{
            foo2 += 1;
        }

        if(foo1+foo2>=s){
            break;
        }
    }
    int ans_1 = foo2-foo1;

    for(int i = 0; i<s;i++){
        if(i%c==0&&i>=c ){
            foo_3 += d;
        }
        else{
            foo_4 += 1;
        }
        if(foo_3+foo_4>=s){
            break;
        }
    }

    int ans_2 = foo_4-foo_3;
    if (ans_1 > ans_2){
        cout << "Nikky";
    }
    else if(ans_1 < ans_2){
        cout << "Byron";
    }
    else{
        cout << "Tied";
    }



}

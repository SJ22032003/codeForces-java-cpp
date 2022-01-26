#include <bits/stdc++.h>
using namespace std;
template<typename A, typename B> ostream& operator<<(ostream &os, const pair<A, B> &p) { return os << '(' << p.first << ", " << p.second << ')'; }
template<typename T_container, typename T = typename enable_if<!is_same<T_container, string>::value, typename T_container::value_type>::type> ostream& operator<<(ostream &os, const T_container &v) { os << '{'; string sep; for (const T &x : v) os << sep << x, sep = ", "; return os << '}'; }
void dbg_out() { cerr << endl; }
template<typename Head, typename... Tail> void dbg_out(Head H, Tail... T) { cerr << ' ' << H; dbg_out(T...); }
#ifdef LOCAL
// #define dbg(...) cerr << "(" << #__VA_ARGS__ << "):", dbg_out(VA_ARGS)
#else
#define dbg(...)
#endif
#define ar array
#define lL long long
#define ld long double
#define size(x) ((int)x.size())
#define all(a) (a).begin(), (a).end()
const int MAX_N = 1e5 + 5; const lL MOD = 1e9 + 7; const lL INF = 1e9; const ld EPS = 1e-9;
void result() {
    lL n,qA;cin>>n>>qA;
    if(qA>ceil((double)n/2)) {
        cout<<"-1\n";return;
    }
    for(lL i=0;i<n;i++) {
        for(lL j=0;j<n;j++) 
        if(i==j&&i%2==0&&qA>0)
        cout<<"R",qA--;
        else
        cout<<".";
        cout<<"\n";
    }
}
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);
    int tc = 1;
    cin >> tc;
    for (int t = 1; t <= tc; t++) {
        result();
    }
}
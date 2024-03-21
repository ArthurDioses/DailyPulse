import SwiftUI
import shared

struct ContentView: View {

	var body: some View {
        ArticlesScreen(viewModel: .init())
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}

//
//  AboutScreen.swift
//  iosApp
//
//  Created by Arthur Felipe Dioses Reto on 19/03/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

struct AboutScreen: View {
    var body: some View {
        NavigationStack{
            AboutListView()
                .navigationTitle("About Device")
        }
    }
}

#Preview {
    AboutScreen()
}

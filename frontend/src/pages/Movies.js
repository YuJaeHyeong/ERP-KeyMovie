import React from 'react'
import Movie from '../component/Movie';
import { dummy } from "../movieDummy";

export default function Movies() {

  return (
    <div>
      <div className="movies-container">
        {dummy.results.map((item) => {
          return (
            <Movie
              title={item.title}
              overview={item.overview}
              poster_path={item.poster_path}
              vote_average={item.vote_average}
            />
          );
        })}
      </div>
    </div>
  )
}